package genetic;
import java.util.ArrayList;
class Thought196 extends Thought{
private static ArrayList<Thought196> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 975.4063517431005;
private double fd1 = 642.0839531614446;
private Thought fo0 = null;
private Thought fo1 = null;
Thought196 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought196 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought196 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought196 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought196 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought196 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought196 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought196 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought196 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought196 instance = new Thought196 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought196 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought196 instance = new Thought196 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought196 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought196 instance = new Thought196 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought196 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought196 instance = new Thought196 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought196 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought196 instance = new Thought196 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought196 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought196 instance = new Thought196 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought196 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought196 instance = new Thought196 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought196 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought196 instance = new Thought196 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 99.3458023774773;
if(fo0 != null){
      fb0 = fo0.m2();
}
    double ld1 = 703.9126904195456;
    double ld2 = 216.34200868914783;
    if (fb1) {
        fb0 = ld0 < ld1;
        fb1 = fb0 || fb1;
        Thought lo3 = Thought147.getInstance(fb0, fb1, fb0, fb1);
        ld2 = fd0 - fd1;
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, ld2, fd0, fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ld0, ld1, ld2, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb4 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb4, fb0);
}
        for(int i0=0; i0<10; i0++){
            fb1 = !lb4;
if(fo1 != null){
              fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
              fo0 = fo1.m4(ld0, ld1, ld2, fd0);
}
            Thought lo5 = Thought75.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ld2);
            boolean lb6 = false;
            lb4 = fb0 && fb1;
if(fo1 != null){
              fo0 = fo1.m4();
}
            double ld7 = 789.3642409839649;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Output.points[6][6] += fd0;
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
    Thought lo3 = Thought110.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
    boolean lb4 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, lb2, lb4, ab1);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb0 = fb1 || lb0;
    lb1 = lb2 || lb4;
    boolean lb5 = true;
    Thought lo6 = Thought257.getInstance(lb5, ab1, ab2, ab3);
    if (ab4) {
        boolean lb7 = true;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb7);
}
        double ld8 = 578.2196637125186;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][7] -= ad2;
    fb1 = ad3 < ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 32.24776934704506;
    Thought lo1 = Thought384.getInstance(ad4, fd0, fd1, ld0);
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ld0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad1 *= -1;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
    fb1 = ad2 > ad3;
    for(int i0=0; i0<10; i0++){
        Output.points[6][8] += ad4;
        double ld0 = 732.6298830403365;
        double ld1 = 491.0921631547214;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ab1 = ab2 && ab3;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
        double ld2 = 809.6428516763579;
        for(int i1=0; i1<10; i1++){
            Thought lo3 = Thought299.getInstance(fo0, fo1, fo0, fo1, ld0, ld1, ld2, ad1);
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(ao3 != null){
      fd1 = ao3.m3(fb0, fb1, lb0, fb0);
}
    if (fb1) {
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        Output.points[7][0] -= fd0;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
        double ld1 = 44.44564963888214;
        Output.points[7][1] += fd0;
        lb0 = fd1 < ld1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fb0 = !fb1;
        fd0 = fd1 + ld1;
        lb0 = fd0 < fd1;
        fb0 = fb1 && lb0;
        fb0 = ld1 < fd0;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb0 = ad1 < ad2;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    Output.points[7][2] += ad3;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    Output.points[7][3] += ad2;
if(ao2 != null){
      ad3 = ao2.m3();
}
    fb1 = !fb0;
    ad4 = fd0 - fd1;
    boolean lb0 = false;
if(ao3 != null){
      ad1 = ao3.m3(fb0, fb1, lb0, fb0);
}
    ad2 *= -1;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fb0 = ao3.m2(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
        }
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
        if (fb0) {
        boolean lb1 = true;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        fb0 = fd0 < fd1;
        boolean lb2 = true;
        Thought lo3 = Thought301.getInstance(ad1, ad2, ad3, ad4);
        Output.points[7][4] -= fd0;
        fd1 = ad1 + ad2;
        boolean lb4 = false;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    if (ab1) {
        ab2 = ab3 && ab4;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
          ao1.m2();
}
        boolean lb0 = true;
        Thought lo1 = Thought178.getInstance(ab4, fb0, fb1, lb0);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        Thought lo2 = Thought61.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
        ab2 = fd1 > fd0;
        ab3 = !ab4;
        fd1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
        ab2 = ab3 || ab4;
        Thought lo3 = Thought366.getInstance(ao2, ao3, ao4, fo0);
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fb0 = ad2 > ad3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    boolean lb0 = true;
if(ao1 != null){
      ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought190.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    Thought lo2 = Thought268.getInstance(fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    Output.points[7][5] += ad4;
    fd0 *= -1;
    fd1 *= -1;
    Output.points[7][6] += ad1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    Thought lo2 = Thought378.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
    fb0 = fd1 < fd0;
    Output.points[7][7] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
    boolean lb3 = false;
    Output.points[7][8] -= fd1;
    fb0 = fd0 < fd1;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    ab3 = ab4 || fb0;
    fb1 = !lb0;
    Output.points[8][0] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 > fd0;
if(fo1 != null){
      fo1.m1();
}
    boolean lb1 = false;
    fd1 *= -1;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought81.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
    ab2 = fd0 < fd1;
    ab3 = !ab4;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    ad4 = fd0 - fd1;
    double ld1 = 42.67764540270619;
if(fo1 != null){
      fo1.m3(ld1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    Thought lo2 = Thought101.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
    lb0 = fb0 && fb1;
    Thought lo3 = Thought397.getInstance(fo0, fo1, fo0, fo1);
    Thought lo4 = Thought292.getInstance(ad4, fd0, fd1, ld1);
    lb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    Thought lo5 = Thought183.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2);
if(fo0 != null){
      fo0.m1();
}
    fb0 = fb1 || lb0;
    boolean lb6 = true;
    lb6 = fb0 && fb1;
    lb0 = ad3 > ad4;
    lb6 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(lb0, lb6, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, lb0, lb6, fb0, fb1);
}
    lb0 = lb6 || fb0;
    fb1 = !lb0;
    if (lb6) {
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 249.56100543603563;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought113.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ld0);
}
    ad1 *= -1;
    ab4 = fb0 && fb1;
    ab1 = ad2 < ad3;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    ab1 = !ab2;
    Thought lo2 = Thought59.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
        ab3 = ab4 && fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fb0 && fb1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought164.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fd0 *= -1;
    fb1 = lb0 && fb0;
    fd1 = fd0 + fd1;
    fb1 = lb0 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Output.points[8][1] -= fd0;
    Thought lo2 = Thought158.getInstance(ao1, ao2, ao3, ao4);

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fb0 = !fb1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    boolean lb1 = true;
    lb0 = lb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    fb1 = !lb0;
    ad2 = ad3 - ad4;
if(ao2 != null){
      lb1 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, lb1);
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    boolean lb0 = true;
        lb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    ab1 = ab2 && ab3;
if(fo0 != null){
          ab4 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        Output.points[8][2] -= fd1;
    Output.points[8][3] += fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = lb0 || ab1;
    Output.points[8][4] += fd0;
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought188.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    Output.points[8][5] += fd1;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ad4 > fd0;
    ab3 = ab4 && fb0;
    fd1 = ad1 + ad2;
    fb1 = ad3 > ad4;
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb1, ab1);
}
    Output.points[8][6] += ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3(ad1, ad2, ad3, ad4, fb1, lb1, ab1, ab2);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb1);
}
    Thought lo2 = Thought117.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 + fd0;
        fb1 = fb0 && fb1;
        boolean lb0 = true;
        } else {
        fb0 = fd1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        Thought lo1 = Thought83.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
        fb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 908.5523729304578;
    ab2 = ld0 > fd0;
    fd1 = ld0 - fd0;
    boolean lb1 = true;
    fd1 = ld0 - fd0;
    fd1 *= -1;
    ld0 *= -1;
    ab2 = ab3 && ab4;
    double ld2 = 718.6416401159345;
    ld2 *= -1;
    fb0 = fb1 && lb1;
    ab1 = fd0 < fd1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(ld0, ld2, fd0, fd1);
}
        Thought lo3 = Thought279.getInstance(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1);
        ab2 = ab3 && ab4;
        fb0 = ld0 < ld2;
        fb1 = lb1 && ab1;
        fd0 = fd1 + ld0;
        Thought lo4 = Thought166.getInstance();
        boolean lb5 = false;
if(fo0 != null){
          fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
}
Thought.STACK_COUNTER++;
return ld2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Output.points[8][7] -= ad3;
    Thought lo0 = Thought327.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    for(int i0=0; i0<10; i0++){
        }
    Thought lo1 = Thought32.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    Thought lo2 = Thought86.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    Output.points[8][8] += ad2;
    fb0 = fb1 || ab1;
        ad3 = ad4 - fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[0][0] -= fd1;
    ab1 = ad1 < ad2;
    ab2 = !ab3;
    Thought lo1 = Thought371.getInstance(ab4, fb0, fb1, lb0);
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    Output.points[0][1] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
    ad3 *= -1;
    Thought lo2 = Thought59.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad4 *= -1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
    Output.points[0][2] -= fd1;
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(ao3 != null){
      lb0 = ao3.m2();
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    Thought lo1 = Thought117.getInstance(fb1, lb0, fb0, fb1);
    Output.points[0][3] -= fd0;
    fd1 *= -1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb2 = true;
    lb2 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb0, lb2, fb0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb0 = false;
    Thought lo1 = Thought245.getInstance(ad1, ad2, ad3, ad4);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = ad3 < ad4;
    double ld2 = 592.3293509764919;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ad1, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao2.m3(fd0, fd1, ld2, ad1, fb1, lb0, fb0, fb1);
}
    double ld3 = 280.4714914094277;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    boolean lb4 = false;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
        lb0 = ad4 > fd0;
    fd1 *= -1;

Thought.STACK_COUNTER++;
return ld2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    fd1 *= -1;
    ab4 = !fb0;
    double ld0 = 403.801088186325;
    ld0 *= -1;
    boolean lb1 = true;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
    Output.points[0][4] -= ld0;
if(ao3 != null){
      ao3.m3();
}
        fb1 = !lb1;
if(ao4 != null){
      ab1 = ao4.m2(ab2, ab3, ab4, fb0);
}
        fd0 = fd1 + ld0;
    Thought lo2 = Thought373.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb1, lb1, ab1, ab2);
    ab3 = ab4 && fb0;
    fb1 = fd1 > ld0;
    lb1 = ab1 && ab2;
    fd0 = fd1 - ld0;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought388.getInstance(ad1, ad2, ad3, ad4);
    ab2 = fd0 < fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
          ab3 = ao1.m2();
}
if(ao2 != null){
      ao2.m3(ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought310.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
    ad3 = ad4 - fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought241.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    double ld2 = 895.1832849886024;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    fb0 = fb1 && lb1;
    fb0 = fb1 && lb1;
    fb0 = ld2 < fd0;
    fb1 = !lb1;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fb0, fb1, lb1, fb0);
}
    fd1 = ld2 + fd0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought86.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    Thought lo2 = Thought61.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld3 = 462.1686501265487;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld3, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = ab1 && ab2;
    ld3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, lb0, ab1, ab2, ab3);
}
    boolean lb4 = true;
    boolean lb5 = true;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld3, fd0, fd1, fb1, lb0, lb4, lb5);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab4 = ld3 < fd0;
    double ld7 = 177.99809814070323;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(ld3, ld7, fd0, fd1);
}
    fb1 = !lb0;
    boolean lb8 = true;
    boolean lb9 = false;
    boolean lb10 = false;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought79.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    ad2 = ad3 + ad4;
    Thought lo2 = Thought57.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = !ab1;
    ad1 *= -1;
    ab2 = ad2 > ad3;
    Output.points[0][5] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought85.getInstance(fd0, fd1, ad1, ad2);
    Output.points[0][6] -= ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m1();
}
    fb1 = lb0 || ab1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    boolean lb3 = false;
    Output.points[0][7] -= fd0;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb2);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 < fd1;
        fb1 = fd0 > fd1;
if(ao2 != null){
          fb0 = ao2.m2(fd0, fd1, fd0, fd1);
}
        double ld0 = 187.24948887002387;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
        boolean lb1 = false;
        fb0 = !fb1;
        double ld2 = 245.7430794048143;
if(ao4 != null){
          ao3 = ao4.m4();
}
        for(int i1=0; i1<10; i1++){
            ld2 = fd0 - fd1;
            Thought lo3 = Thought254.getInstance(lb1, fb0, fb1, lb1);
if(fo0 != null){
              fo0.m1(fo1, ao1, ao2, ao3, ld0, ld2, fd0, fd1, fb0, fb1, lb1, fb0);
}
            fb1 = ld0 < ld2;
if(ao4 != null){
              fd0 = ao4.m3(fd1, ld0, ld2, fd0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
              fd1 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb1, fb0);
}
            Thought lo4 = Thought283.getInstance(ao4, fo0, fo1, ao1);
            fb1 = ld0 < ld2;
if(ao2 != null){
              fd0 = ao2.m3(fd1, ld0, ld2, fd0);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ld2, fd0);
}
}}
Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fb0 = ao4.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld0 = 65.89300433005722;
    Output.points[0][8] += ad1;
    boolean lb1 = true;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought396.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
    boolean lb3 = true;
    boolean lb4 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb4, fb0, fb1, lb1);
}
    ad4 *= -1;
if(ao4 != null){
      lb3 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m1(fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    lb4 = fd1 > ld0;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb1, lb3, lb4);
}
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb3);
}
    boolean lb5 = true;
    Output.points[1][0] += fd1;
    lb4 = ld0 < ad1;
    lb5 = ad2 < ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ad1, fb0, fb1, lb1, lb3);
}

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 - fd1;
    Output.points[1][1] -= fd0;
    double ld0 = 332.1922510803806;
    fd0 *= -1;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, fd0, fd1);
}
    ab2 = ab3 && ab4;
    fb0 = ld0 > fd0;
    fd1 = ld0 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
        boolean lb1 = true;
    double ld2 = 210.16377156522904;
    fb0 = !fb1;
if(ao1 != null){
      lb1 = ao1.m2();
}
    Output.points[1][2] -= ld2;
    fd0 = fd1 - ld0;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 984.6468247661506;
if(ao1 != null){
      ao1.m1(ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
        boolean lb1 = false;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
if(ao1 != null){
          ad1 = ao1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, ab1, ab2);
}
        Output.points[1][3] -= fd1;
        ld0 = ad1 + ad2;
        double ld2 = 243.6406412144546;
        boolean lb3 = true;
        boolean lb4 = true;
        ad2 *= -1;
        double ld5 = 500.9114326736362;
        ad2 = ad3 - ad4;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
}
Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    fb0 = !fb1;
    Output.points[1][4] += fd1;
        Thought lo0 = Thought78.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
        Output.points[1][5] += fd0;
    double ld1 = 762.9364508258441;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1();
}
    Thought lo2 = Thought305.getInstance(fb1, fb0, fb1, fb0);
        fb1 = !fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd1 = ld1 - fd0;
    fb1 = fb0 && fb1;
    fd1 = ld1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought301.getInstance(fd1, ld1, fd0, fd1);
    fb0 = fb1 && fb0;
    fb1 = !fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 263.53740989039574;
    fb1 = fb0 && fb1;
    double ld1 = 801.1041110323995;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
}
    ld0 = ld1 - fd0;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd1 *= -1;
if(fo0 != null){
          ld0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = ld1 < fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    fb0 = !fb1;
        Thought lo1 = Thought314.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
    Output.points[1][6] -= fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
        boolean lb2 = false;
    Thought lo3 = Thought134.getInstance();
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
