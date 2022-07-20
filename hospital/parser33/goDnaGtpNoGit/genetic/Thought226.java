package genetic;
import java.util.ArrayList;
class Thought226 extends Thought{
private static ArrayList<Thought226> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 962.0151682998061;
private double fd1 = 571.9803247521608;
private Thought fo0 = null;
private Thought fo1 = null;
Thought226 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought226 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought226 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought226 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought226 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought226 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought226 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought226 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought226 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought226 instance = new Thought226 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought226 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought226 instance = new Thought226 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought226 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought226 instance = new Thought226 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought226 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought226 instance = new Thought226 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought226 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought226 instance = new Thought226 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought226 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought226 instance = new Thought226 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought226 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought226 instance = new Thought226 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought226 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought226 instance = new Thought226 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
    fb1 = !fb0;
    Thought lo0 = Thought88.getInstance();
    boolean lb1 = false;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    lb2 = !fb0;
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb1, lb2);
}
    lb3 = fb0 && fb1;
    lb1 = !lb2;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    lb1 = !lb2;
    fd1 = fd0 - fd1;
    lb3 = fb0 && fb1;

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
    boolean lb0 = false;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
    Output.points[3][1] -= fd0;
    ab3 = ab4 || fb0;
    boolean lb1 = true;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fb1 = fo1.m2(lb0, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    if (lb0) {
        fd0 *= -1;
        boolean lb2 = true;
        lb0 = !lb1;
        ab1 = fd1 > fd0;
        boolean lb3 = true;
        fd1 = fd0 - fd1;
        double ld4 = 538.1105113803616;
        Output.points[3][2] -= ld4;
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
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought382.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    Output.points[3][3] -= ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    Thought lo2 = Thought283.getInstance();
    ad3 = ad4 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb1, fb0);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    Output.points[3][4] -= ad3;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ab2 = ab3 && ab4;
    Output.points[3][5] += ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = ad2 < ad3;

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
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    Thought lo1 = Thought11.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
    lb0 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fb1 = !lb0;
if(ao4 != null){
      ao4.m3(fd1, fd0, fd1, fd0);
}
    double ld2 = 590.6246064582733;
    fd0 *= -1;
    fb0 = !fb1;
        lb0 = !fb0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, ld2, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      ld2 = fo1.m3(fb1, lb0, fb0, fb1);
}
    Output.points[3][6] += fd0;
    lb0 = fb0 && fb1;
    fd1 *= -1;
        ld2 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0, fb0, fb1, lb0, fb0);
}
        fd1 *= -1;
        fb1 = ld2 < fd0;
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
    double ld0 = 649.7708623228252;
    Output.points[3][7] += ld0;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[3][8] -= fd0;
    fd1 *= -1;
    fb0 = !fb1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    Output.points[4][0] += ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad1 = ad2 + ad3;
    Thought lo1 = Thought397.getInstance(ad4, fd0, fd1, ld0);
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    double ld2 = 541.9571264103868;
    boolean lb3 = true;
    fb0 = fb1 && lb3;
    if (fb0) {
        fb1 = fd0 < fd1;
        Output.points[4][1] += ld0;
        ld2 = ad1 - ad2;
        boolean lb4 = false;
if(ao3 != null){
          ao2 = ao3.m4();
}
        Output.points[4][2] -= ad3;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              ao4 = fo0.m4(lb4, lb3, fb0, fb1);
}
            ad4 *= -1;
            lb4 = !lb3;
            fd0 *= -1;
            Thought lo5 = Thought194.getInstance(fo1, ao1, ao2, ao3, fd1, ld0, ld2, ad1, fb0, fb1, lb4, lb3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = false;
    fd1 *= -1;
if(ao2 != null){
      lb0 = ao2.m2(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fd0 *= -1;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        lb1 = !ab1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
        Thought lo2 = Thought222.getInstance(ab2, ab3, ab4, fb0);
        fd1 = fd0 - fd1;
        boolean lb3 = false;
        }
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
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
    fb0 = !fb1;
    boolean lb0 = true;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
    boolean lb1 = true;
    ab3 = ab4 || fb0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, lb0, lb1, ab1);
}
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ab1 = !ab2;
    double ld3 = 633.916665418686;
    double ld4 = 997.7447899120657;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ab3 = ld3 < ld4;
    ab4 = ad1 < ad2;
    Thought lo5 = Thought25.getInstance(fb0, fb1, lb0, lb1);
    double ld6 = 924.9737753025723;
if(fo0 != null){
      lb2 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld3, ld4, ld6, fb0, fb1, lb0, lb1);
}
    lb2 = ab1 || ab2;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 - ad3;
    double ld7 = 310.55566354544305;
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3);
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
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb1 = !lb2;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        boolean lb0 = true;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 + fd0;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
        ab2 = fd0 > fd1;
        ab3 = fd0 > fd1;
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    lb0 = !fb0;
    fb1 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    double ld1 = 391.3541965232006;
    ad3 *= -1;
    fb0 = ad4 > fd0;
    double ld2 = 279.33545877760747;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[4][3] += fd0;
    fd1 = ld1 + ld2;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ab1 = fo1.m2();
}
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
        double ld0 = 156.09883361469056;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        if (ab2) {
            ab3 = ab4 || fb0;
            Output.points[4][4] -= ad2;
if(fo0 != null){
              fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
            ld0 = ad1 + ad2;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
            boolean lb1 = false;
            Thought lo2 = Thought217.getInstance();
            boolean lb3 = false;
            Thought lo4 = Thought370.getInstance(ab4, fb0, fb1, lb1);
            ld0 *= -1;
            ad1 *= -1;
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb3, ab1, ab2, ab3);
}
            ab4 = !fb0;
}}
Thought.STACK_COUNTER++;
return ab2;
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
    Output.points[4][5] += fd0;
    boolean lb1 = true;
    Output.points[4][6] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    lb0 = fd0 < fd1;
    boolean lb2 = false;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, lb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought339.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        lb0 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        lb1 = lb2 && fb0;
        fb1 = lb0 || lb1;
        Thought lo4 = Thought154.getInstance(lb2, fb0, fb1, lb0);
        lb1 = lb2 || fb0;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
        fd0 = fd1 - fd0;
        boolean lb5 = false;
        lb2 = fb0 || fb1;
}
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
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
if(ao1 != null){
      ao1.m1(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    boolean lb1 = false;
    ad3 *= -1;
    double ld2 = 151.63382129237775;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[4][7] += ad3;
if(ao2 != null){
      ao2.m2(ad4, fd0, fd1, ld2);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    lb1 = !fb0;
    fd0 = fd1 + ld2;
    fb1 = lb0 && lb1;
    fb0 = fb1 || lb0;
    lb1 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[4][8] += ad3;
    ad4 = fd0 + fd1;
    Thought lo3 = Thought109.getInstance(fb0, fb1, lb0, lb1);
if(ao4 != null){
      ld2 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 - ld2;
    fb0 = ad1 < ad2;
    fb1 = !lb0;

Thought.STACK_COUNTER++;
return lb1;
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
    ab1 = fd1 > fd0;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    boolean lb0 = false;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought135.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb3 = false;
    lb0 = !lb1;
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd0 = ao3.m3(lb3, lb4, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = lb0 || lb1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb3, lb4, ab1, ab2);
}
    boolean lb5 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb1, lb0, lb1, lb3);
}
    lb4 = lb5 || ab1;
    ab2 = !ab3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
    Output.points[5][0] -= ad1;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought202.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
    Thought lo1 = Thought376.getInstance();
    ab2 = ab3 && ab4;
    double ld2 = 705.3619740665426;
    fb0 = !fb1;
    ab1 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought243.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ab3 = fo1.m2(fd1, ld2, ad1, ad2);
}
    ad3 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld2);
}
    double ld4 = 945.3330958601524;
    boolean lb5 = true;
    ld4 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m3(ab3, ab4, fb0, fb1);
}
    Output.points[5][1] += ad1;
if(ao3 != null){
      lb5 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld2, ld4, ad1, fb0, fb1, lb5, ab1);
}
    ab2 = ab3 && ab4;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    boolean lb1 = false;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        lb0 = !lb1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = !fb0;
    fb1 = fd0 > fd1;
if(fo0 != null){
      lb0 = fo0.m2(lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought384.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
    lb1 = fb0 && fb1;
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    Thought lo3 = Thought374.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
    fd0 = fd1 + fd0;
    fb1 = !lb0;

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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab3 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab4 = fb0 && fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    boolean lb0 = true;
    Thought lo1 = Thought381.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = fb1 && lb0;
    ab1 = fd0 < fd1;

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
    fb0 = ad2 < ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought326.getInstance(ad3, ad4, fd0, fd1);
    ad1 *= -1;
    fb1 = fb0 || fb1;
    boolean lb1 = false;
    double ld2 = 123.98422917994351;
    Output.points[5][2] -= ad1;
    Output.points[5][3] -= ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2);
}
    lb1 = fb0 && fb1;
    lb1 = fb0 && fb1;
    lb1 = ad1 < ad2;
    fb0 = !fb1;
    Thought lo3 = Thought371.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
        for(int i1=0; i1<10; i1++){
            fd1 = ld2 + ad1;
if(fo0 != null){
              ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
            Output.points[5][4] -= ld2;
            double ld4 = 496.56878457068865;
            fb1 = lb1 || fb0;
            Thought lo5 = Thought357.getInstance(ld2, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    double ld1 = 511.75297335736303;
    ab4 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fb0 = fd1 > ld1;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
    double ld2 = 199.71299546321933;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
    double ld3 = 460.3477553305717;
    boolean lb4 = true;
    fb0 = ld2 < ld3;
    fb1 = lb0 || lb4;
if(fo0 != null){
      ad1 = fo0.m3();
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ld2, ld3, fb0, fb1, lb0, lb4);
}
    Thought lo5 = Thought62.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    boolean lb6 = false;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    fd1 = ld1 - ld2;
    Thought lo7 = Thought249.getInstance(fo0, fo1, fo0, fo1);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    Thought lo0 = Thought339.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fb0 = fo1.m2();
}
    Thought lo1 = Thought81.getInstance(fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
    Output.points[5][5] -= fd0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld2 = 84.20182130003066;
    fd0 = fd1 - ld2;
    fb0 = fd0 > fd1;
    ld2 = fd0 - fd1;
    Thought lo3 = Thought390.getInstance(ld2, fd0, fd1, ld2, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb4 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 || fb1;
    double ld0 = 148.42035695826345;
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ld0);
}
    fb0 = fb1 && fb0;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 - ad1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb1, fb0);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought88.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Output.points[5][6] -= fd0;
    Thought lo2 = Thought379.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
    lb0 = ab1 || ab2;
        ab3 = !ab4;
    Thought lo3 = Thought278.getInstance();
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
    ab3 = ab4 && fb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought295.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
    Output.points[5][7] += fd1;
    Thought lo1 = Thought364.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    Output.points[5][8] -= fd0;
    ab3 = fd1 > ad1;
    ab4 = ad2 < ad3;
    fb0 = !fb1;
    double ld2 = 924.6924996584639;
    ab1 = ad3 > ad4;
    ab2 = ab3 || ab4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ad1);
}
if(fo1 != null){
      fo1.m1();
}
    boolean lb3 = true;
    ab4 = !fb0;

Thought.STACK_COUNTER++;
return ad2;
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
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
        fd1 *= -1;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    Thought lo1 = Thought22.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    double ld2 = 404.88939268759685;
    Thought lo3 = Thought222.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    boolean lb4 = false;
    Thought lo5 = Thought77.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld2);
}
    fd0 = fd1 + ld2;

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
    ab1 = ab2 || ab3;
    ab4 = fd1 < fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought395.getInstance();
    double ld2 = 241.74647646818173;
    ab4 = fd0 > fd1;
    fb0 = ld2 > fd0;
    fb1 = !lb0;
        ab1 = fd1 > ld2;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    fd0 = fd1 + ld2;
        ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ld2 *= -1;
    double ld3 = 681.4226957088567;
    Thought lo4 = Thought312.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
    Output.points[6][0] -= ld3;

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
    double ld0 = 846.545234455218;
    fb1 = ld0 < ad1;
    double ld1 = 931.0280953015448;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    boolean lb3 = true;
    Output.points[6][1] += fd0;
    double ld4 = 23.749154180945162;
    fd0 *= -1;
    lb3 = !fb0;
    fb1 = fd1 < ld0;

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
    ad2 = ad3 - ad4;
    ab1 = !ab2;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought13.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought137.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
    ab3 = ab4 && fb0;
    fb1 = lb2 && ab1;
    boolean lb3 = true;
    ab1 = ab2 && ab3;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    double ld0 = 779.9396949893326;
    fb1 = fd0 < fd1;
    ld0 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
        ld0 = fd0 + fd1;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
    double ld1 = 697.865186247281;
if(fo1 != null){
      fo1.m2();
}
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought68.getInstance(ao3, ao4, fo0, fo1, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
    ld0 = ld1 - fd0;
if(ao1 != null){
      ao1.m3(fd1, ld0, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    double ld0 = 816.7946928974759;
    Thought lo1 = Thought86.getInstance(ao2, ao3, ao4, fo0);
    Output.points[6][2] += ld0;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought101.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
          fb0 = fo1.m2();
}
        fd0 *= -1;
if(ao1 != null){
          ao1.m2(fb1, fb0, fb1, fb0);
}
        Output.points[6][3] -= fd1;
        ld0 = ad1 - ad2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = ld0 > ad1;
        boolean lb3 = false;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    double ld1 = 802.7345143879778;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 || lb0;
    ab1 = ld1 < fd0;
if(ao1 != null){
      ao1.m3(fd1, ld1, fd0, fd1);
}
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
    fd0 = fd1 + ld1;
    ab4 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = ld1 > fd0;
    fd1 = ld1 + fd0;
    Thought lo2 = Thought48.getInstance(fb1, lb0, ab1, ab2);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(ld1, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
    fd0 *= -1;
    fd1 *= -1;
    Thought lo3 = Thought390.getInstance(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
    ab1 = !ab2;
    double ld4 = 285.4614966730872;

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
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought113.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 + ad2;
    ab2 = ab3 || ab4;
    double ld1 = 630.6679076521525;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    Thought lo2 = Thought375.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ad1);
    double ld3 = 421.46783586710956;
    ab1 = !ab2;
if(fo0 != null){
      fo0.m2();
}
    ad1 = ad2 + ad3;
    ab3 = ab4 && fb0;
    boolean lb4 = true;
    fb0 = fb1 || lb4;
    ab1 = ad4 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !lb4;
    fd1 *= -1;
if(ao2 != null){
          ab1 = ao2.m2(ao3, ao4, fo0, fo1, ld1, ld3, ad1, ad2, ab2, ab3, ab4, fb0);
}
    boolean lb5 = true;
    Output.points[6][4] += ad3;
    boolean lb6 = true;
    ab4 = fb0 || fb1;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ld1, ld3, lb4, lb5, lb6, ab1);
}
    ad1 = ad2 + ad3;
    ab2 = !ab3;

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
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought384.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[6][5] -= fd0;
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
if(fo0 != null){
          fd0 = fo0.m3();
}
    Thought lo1 = Thought291.getInstance(fb1, fb0, fb1, fb0);
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld2 = 881.1003792978241;
    Thought lo3 = Thought136.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;

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
    double ld0 = 542.134041487843;
    fb0 = !fb1;
    double ld1 = 117.71711627891345;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, fd0, fd1);
}
    double ld2 = 477.8736906671774;
    Output.points[6][6] -= ld0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
}
    double ld3 = 319.0612843626224;
    ld0 = ld1 + ld2;
    fb1 = ld3 < fd0;
    fd1 = ld0 - ld1;
    Thought lo4 = Thought196.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    ld2 = ld3 - fd0;
    fb0 = fd1 > ld0;
    fb1 = !fb0;
    boolean lb5 = false;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1, fb0, fb1, lb5, fb0);
}
    ld0 = ld1 + ld2;
    ld3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1, fb1, lb5, fb0, fb1);
}
    lb5 = fb0 && fb1;
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb5, lb6, fb0, fb1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought233.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought222.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    boolean lb2 = false;
    fd1 *= -1;
    lb2 = fb0 || fb1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought239.getInstance(fo1, fo0, fo1, fo0);
    double ld4 = 560.0322738010696;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld4, fd0);
}
    Output.points[6][7] += fd1;
    lb2 = ld4 > fd0;
    fb0 = fb1 && lb2;
    fd1 = ld4 - fd0;

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
