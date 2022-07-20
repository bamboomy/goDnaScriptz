package genetic;
import java.util.ArrayList;
class Thought158 extends Thought{
private static ArrayList<Thought158> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 807.135747763435;
private double fd1 = 605.3461049332201;
private Thought fo0 = null;
private Thought fo1 = null;
Thought158 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought158 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought158 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought158 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought158 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought158 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought158 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought158 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought158 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought158 instance = new Thought158 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought158 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought158 instance = new Thought158 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought158 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought158 instance = new Thought158 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought158 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought158 instance = new Thought158 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought158 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought158 instance = new Thought158 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought158 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought158 instance = new Thought158 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought158 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought158 instance = new Thought158 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought158 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought158 instance = new Thought158 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought62.getInstance();
    double ld1 = 403.5878115209074;
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        Thought lo2 = Thought164.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
        } else {
        fb1 = fb0 || fb1;
        fb0 = fd0 > fd1;
        boolean lb3 = true;
        boolean lb4 = true;
if(fo0 != null){
          fo1 = fo0.m4(ld1, fd0, fd1, ld1, lb4, fb0, fb1, lb3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb3);
}
        lb4 = fb0 || fb1;
        lb3 = fd0 > fd1;
        lb4 = ld1 > fd0;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fb1 = lb3 || lb4;
        double ld5 = 253.19015619151284;
        fb0 = fb1 || lb3;
        lb4 = fd0 < fd1;
        Output.points[8][8] += ld5;
        fb0 = fb1 && lb3;
        Output.points[0][0] += ld1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld5, ld1);
}
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[0][1] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    Thought lo0 = Thought272.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
    ab4 = !fb0;
    fb1 = !ab1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought271.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 || ab4;
    if (fb0) {
        for(int i0=0; i0<10; i0++){
            boolean lb2 = true;
            fb0 = !fb1;
            fd1 *= -1;
            lb2 = fd0 > fd1;
            boolean lb3 = false;
            boolean lb4 = false;
            lb3 = fd0 > fd1;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd0 > fd1;
        ad1 *= -1;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 93.21855057014066;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 > fd1;
    fb0 = ld0 > ad1;
    fb1 = ad2 > ad3;

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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[0][2] += ad1;
    Thought lo0 = Thought17.getInstance();
    ab1 = !ab2;
    Thought lo1 = Thought212.getInstance(ab3, ab4, fb0, fb1);
    ad2 = ad3 + ad4;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    double ld2 = 497.3359586535186;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 629.4251063531493;
    boolean lb1 = false;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    Thought lo2 = Thought161.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            fb1 = !lb1;
            fb0 = fb1 && lb1;
if(ao1 != null){
              fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
            ld0 *= -1;
            Thought lo3 = Thought350.getInstance();
            }
        Thought lo4 = Thought76.getInstance(fb1, lb1, fb0, fb1);
        lb1 = fb0 || fb1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
        fb0 = fb1 || lb1;
        }
    boolean lb5 = true;
    lb5 = fd1 > ld0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1, fb0, fb1, lb1, lb5);
}
    Output.points[0][3] += ld0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb5);
}
    fb0 = fd0 > fd1;
    fb1 = ld0 < fd0;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad1 = ad2 + ad3;
    fb0 = fb1 && fb0;
    ad4 *= -1;
    fd0 *= -1;
    fb1 = !fb0;
        Thought lo0 = Thought327.getInstance(fd1, ad1, ad2, ad3);
    fb1 = ad4 > fd0;
    fb0 = fb1 || fb0;
    double ld1 = 982.146858340447;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
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
    ab2 = !ab3;
if(ao1 != null){
      ab4 = ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab3 = !ab4;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    Output.points[0][4] -= fd0;
    fd1 *= -1;

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
    ab1 = !ab2;
    ad1 *= -1;
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought66.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    ad1 *= -1;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m1(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    if (ab2) {
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
        Output.points[0][5] += ad2;
        ab3 = !ab4;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
        ad1 = ad2 + ad3;
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
      fo1.m2();
}
    Thought lo0 = Thought285.getInstance(fb0, fb1, fb0, fb1);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[0][6] += fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    double ld1 = 121.6277839470093;
    double ld2 = 249.7278820716801;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld1, ld2);
}
    fb1 = fb0 && fb1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought6.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Thought lo2 = Thought367.getInstance();
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought236.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb4 = false;
    fd1 *= -1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    boolean lb0 = true;
if(fo0 != null){
      fb0 = fo0.m2();
}
    ad1 = ad2 - ad3;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    ad4 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    fb0 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought77.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    boolean lb2 = true;
    lb2 = ad2 > ad3;
    ad4 *= -1;
    Thought lo3 = Thought346.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb4 = false;
    lb4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb2, lb4, fb0);
}
    Thought lo5 = Thought254.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, lb2, lb4);
    ad1 = ad2 - ad3;

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
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[0][7] += ad1;
    boolean lb0 = true;
    double ld1 = 871.5181182525331;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    ab1 = ad1 > ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    Output.points[0][8] -= ad3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = fd0 > fd1;
if(ao4 != null){
      fd0 = ao4.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought319.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    double ld1 = 766.4611906051642;
    boolean lb2 = true;
    double ld3 = 188.52497236019138;
if(fo0 != null){
      ld3 = fo0.m3();
}
if(ao1 != null){
      fo1 = ao1.m4(lb2, fb0, fb1, lb2);
}
    boolean lb4 = false;
    lb4 = fd0 > fd1;
    fb0 = fb1 || lb2;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld1, lb4, fb0, fb1, lb2);
}
    lb4 = ld3 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, ld3, fd0, fb0, fb1, lb2, lb4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad2 *= -1;
    ad3 *= -1;
    fb0 = ad4 > fd0;
    fb1 = !lb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(fd1, ad1, ad2, ad3);
}
    Output.points[1][0] -= ad4;
    Thought lo1 = Thought239.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
if(fo1 != null){
      fb1 = fo1.m2();
}
    ad3 = ad4 + fd0;
    boolean lb2 = true;
    lb0 = fd1 > ad1;
    ad2 = ad3 + ad4;
    Thought lo3 = Thought74.getInstance(lb2, fb0, fb1, lb0);
    lb2 = fd0 < fd1;
    ad1 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, lb0, lb2, fb0);
}
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought205.getInstance(fd1, ad1, ad2, ad3, fb1, lb0, lb2, fb0);
        boolean lb5 = true;
        ad4 = fd0 + fd1;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb5, lb0);
}
        boolean lb6 = false;
        boolean lb7 = false;
        Thought lo8 = Thought89.getInstance(fo0, fo1, ao1, ao2);
        ad1 = ad2 - ad3;
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
    fd1 = fd0 + fd1;
    if (ab2) {
        Output.points[1][1] -= fd0;
        ab3 = ab4 || fb0;
        fd1 = fd0 + fd1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
        boolean lb0 = false;
        double ld1 = 492.7932018391021;
        } else {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
        fb1 = fd0 < fd1;
        for(int i0=0; i0<10; i0++){
            double ld2 = 175.6103842281737;
if(ao3 != null){
              ab1 = ao3.m2();
}
            if (ab2) {
                Thought lo3 = Thought90.getInstance(ab3, ab4, fb0, fb1);
if(ao4 != null){
                  ao4.m2(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
                  ao3.m3(fd0, fd1, ld2, fd0, fb0, fb1, ab1, ab2);
}
                ab3 = ab4 && fb0;
                fd1 = ld2 - fd0;
                fb1 = ab1 && ab2;
                ab3 = ab4 || fb0;
if(ao4 != null){
                  ao4.m1(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
                  ab4 = ao3.m2(ao4, fo0, fo1, ao1);
}
                Thought lo4 = Thought39.getInstance(fd1, ld2, fd0, fd1);
if(ao2 != null){
                  ao2.m1(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2);
}
                Output.points[1][2] -= fd0;
if(ao1 != null){
                  ao1.m3();
}
                fd1 = ld2 - fd0;
}}}
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
    ad1 *= -1;
    ab2 = !ab3;
    double ld0 = 593.8429743890085;
    ad1 = ad2 + ad3;
        ad4 = fd0 - fd1;
    ab4 = fb0 || fb1;
    ld0 *= -1;
    double ld1 = 137.3592964425473;
if(ao2 != null){
      ld1 = ao2.m3(ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
    fb0 = !fb1;
    if (ab1) {
        ab2 = !ab3;
}
Thought.STACK_COUNTER++;
return ab4;
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
    fd1 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
        fb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb0 = false;
if(fo1 != null){
          lb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fb0 = fd1 < fd0;
if(fo0 != null){
          fo0.m2();
}
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
        boolean lb1 = false;
        Thought lo2 = Thought294.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
        lb0 = lb1 || fb0;
        Thought lo3 = Thought287.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
        fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
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
    ab2 = fd0 < fd1;
    double ld0 = 808.4995521405386;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    ab3 = !ab4;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    boolean lb2 = true;
    Thought lo3 = Thought3.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
        Thought lo4 = Thought355.getInstance(fd1, ld0, fd0, fd1, lb1, lb2, ab1, ab2);
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb2 = fd0 > fd1;
    Output.points[1][3] += ld0;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    Thought lo5 = Thought287.getInstance();
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = !fb0;
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
if(fo0 != null){
      fo0.m2(lb0, fb0, fb1, lb0);
}
        fb0 = fd1 < ad1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    ad4 = fd0 + fd1;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    ad1 = ad2 + ad3;
    lb1 = fb0 && fb1;
    boolean lb2 = true;
    lb0 = ad4 > fd0;
    fd1 = ad1 - ad2;
    double ld3 = 470.75028167604205;
    lb1 = ad2 < ad3;
    ad4 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ld3;
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
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld0 = 599.6512504760499;
    double ld1 = 137.8690120291193;
    ab2 = ab3 || ab4;
    double ld2 = 436.56219979848885;
if(fo0 != null){
      fb0 = fo0.m2(ld1, ld2, ad1, ad2);
}
    ad3 *= -1;
    fb1 = ab1 || ab2;
    ab3 = ad4 > fd0;
    fd1 = ld0 + ld1;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = true;
    boolean lb4 = true;
    lb3 = ld0 > ld1;
if(fo0 != null){
      lb4 = fo0.m2(ab1, ab2, ab3, ab4);
}
    ld2 = ad1 + ad2;
    fb0 = fb1 || lb3;
    lb4 = ad3 > ad4;
    double ld5 = 970.6227310544571;

Thought.STACK_COUNTER++;
return ad4;
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
    double ld0 = 9.603299589490913;
    ld0 = fd0 + fd1;
    fb0 = !fb1;
    ld0 *= -1;
    fd0 = fd1 + ld0;
    Thought lo1 = Thought314.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    fb0 = fb1 && lb2;
    fb0 = ld0 > fd0;
    fb1 = fd1 > ld0;
    fd0 = fd1 + ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb2);
}
    Output.points[1][4] -= fd0;
    fb0 = fb1 && lb2;
    fd1 *= -1;
    boolean lb3 = true;
    boolean lb4 = false;
if(ao2 != null){
      lb3 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    lb0 = fb0 && fb1;
    boolean lb1 = false;
    boolean lb2 = true;
    lb0 = lb1 && lb2;
    fb0 = fd0 > fd1;
    fb1 = lb0 || lb1;
    lb2 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad3 = ad4 - fd0;
    Output.points[1][5] -= fd1;
    Thought lo3 = Thought276.getInstance(fb0, fb1, lb0, lb1);
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
}
if(ao3 != null){
          fd0 = ao3.m3(fd1, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
}
        boolean lb4 = true;
}
Thought.STACK_COUNTER++;
return ad4;
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
    fd0 = fd1 - fd0;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    double ld0 = 527.8677825521189;
    Thought lo1 = Thought217.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
    ab4 = ld0 > fd0;
    fd1 = ld0 + fd0;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 = ld0 - fd0;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m2(ld0, fd0, fd1, ld0, fb0, fb1, lb2, ab1);
}
    ab2 = ab3 && ab4;
    Thought lo3 = Thought52.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb2, ab1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return ld0;
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
    Thought lo0 = Thought361.getInstance(ad2, ad3, ad4, fd0);
    boolean lb1 = true;
    double ld2 = 750.5018266205764;
    fd0 = fd1 + ld2;
    Output.points[1][6] += ad1;
    lb1 = ad2 > ad3;
    double ld3 = 840.0569572263987;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld2);
}
if(fo1 != null){
      ld3 = fo1.m3();
}
    for(int i0=0; i0<10; i0++){
        ab1 = !ab2;
if(ao2 != null){
          ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
        ad1 *= -1;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
        Thought lo4 = Thought346.getInstance(fd1, ld2, ld3, ad1, ab4, fb0, fb1, lb1);
        double ld5 = 78.5557733662338;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
        double ld6 = 192.56997478787628;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        fb0 = fb1 && lb1;
        ab1 = ld3 < ad1;
if(ao1 != null){
          ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
        ab2 = ld5 < ld6;
        boolean lb7 = true;
        ld2 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld3, ad1, ad2, ad3);
}
        ab2 = ab3 && ab4;
        for(int i1=0; i1<10; i1++){
}}
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
    if (fb0) {
if(fo1 != null){
          fo1.m1();
}
if(fo0 != null){
          fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought181.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
        Output.points[1][7] += fd1;
        Thought lo1 = Thought328.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 - fd0;
        Output.points[1][8] += fd1;
        fb0 = !fb1;
        fb0 = fd0 < fd1;
        fb1 = fd0 < fd1;
        fb0 = fd0 < fd1;
}
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3();
}
    ab3 = !ab4;
    boolean lb0 = true;
    ab4 = fd0 < fd1;
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, ab1, ab2);
}
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    ab2 = fd0 > fd1;
    fd0 = fd1 - fd0;
    boolean lb2 = false;
    ab2 = !ab3;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
        ad2 = ad3 - ad4;
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Output.points[2][0] -= fd0;
        lb0 = fd1 < ad1;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
        Thought lo2 = Thought2.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
        ad4 = fd0 - fd1;
        Thought lo3 = Thought303.getInstance();
        fb0 = fb1 || lb1;
        lb0 = !fb0;
if(fo0 != null){
          ad1 = fo0.m3(fb1, lb1, lb0, fb0);
}
        ad2 = ad3 - ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb1, lb0, fb0);
}
        Thought lo4 = Thought208.getInstance(ad3, ad4, fd0, fd1, fb1, lb1, lb0, fb0);
        fb1 = lb1 || lb0;
        ad1 *= -1;
        fb0 = ad2 > ad3;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb1, lb1, lb0, fb0);
}
        boolean lb5 = true;
        double ld6 = 224.0987086847569;
        fb0 = ad3 > ad4;
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    Output.points[2][1] += fd1;
    if (ab2) {
        Output.points[2][2] -= ad1;
        ab3 = ad2 > ad3;
        Output.points[2][3] += ad4;
        } else if (ab4) {
        } else if (fb0) {
        fd0 = fd1 + ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
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
    fd0 = fd1 + fd0;
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 149.537573823901;
    double ld1 = 989.8635818281965;
    ld1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[2][4] -= ld0;
    boolean lb2 = true;
if(ao4 != null){
      ld1 = ao4.m3(fd0, fd1, ld0, ld1, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb2, fb0);
}
    Thought lo3 = Thought95.getInstance(fo0, fo1, ao1, ao2);

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
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    double ld0 = 838.0568309595283;
    ld0 = ad1 + ad2;
    boolean lb1 = false;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
    Thought lo2 = Thought62.getInstance();
    fb0 = fb1 && lb1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ad4 = ao2.m3(fb0, fb1, lb1, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb3 = false;
    ld0 = ad1 - ad2;
    double ld4 = 764.1818231385519;
    lb1 = !lb3;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb3);
}
    fb0 = fd1 < ld0;
    fb1 = ld4 < ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld0;
    ld4 = ad1 - ad2;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 *= -1;
    double ld0 = 604.0339599489474;
    Output.points[2][5] += ld0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ld0 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ld0 *= -1;
        ab3 = !ab4;
    fb0 = !fb1;
if(ao2 != null){
      ao2.m2(fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought376.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ld0 = ao3.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought109.getInstance(fo0, fo1, ao1, ao2);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    Output.points[2][6] -= ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    Output.points[2][7] += fd1;
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao4.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    fd0 *= -1;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    double ld2 = 956.0321827036545;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, lb0, lb1, ab1, ab2);
}
    Output.points[2][8] += ld2;
    ad1 = ad2 + ad3;
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}

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
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
    double ld0 = 677.46669758012;
    fb1 = fd0 < fd1;
    ld0 *= -1;
    Thought lo1 = Thought184.getInstance(fd0, fd1, ld0, fd0);
    fb0 = fd1 > ld0;
    fb1 = fb0 && fb1;
    Output.points[3][0] += fd0;
    double ld2 = 833.7726657445874;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0);
}
    fd1 = ld0 - ld2;
    fd0 *= -1;
    double ld3 = 910.1606123493182;
    Thought lo4 = Thought122.getInstance();
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > ld2;
    fb0 = fb1 || fb0;

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
    double ld0 = 948.2924254539187;
    boolean lb1 = true;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = fd1 < ld0;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    lb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb0 = fd0 < fd1;
        fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought26.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);

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
