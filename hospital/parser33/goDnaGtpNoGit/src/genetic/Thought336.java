package genetic;
import java.util.ArrayList;
class Thought336 extends Thought{
private static ArrayList<Thought336> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 81.97067958026022;
private double fd1 = 925.635491441014;
private Thought fo0 = null;
private Thought fo1 = null;
Thought336 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought336 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought336 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought336 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought336 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought336 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought336 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought336 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought336 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought336 instance = new Thought336 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought336 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought336 instance = new Thought336 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought336 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought336 instance = new Thought336 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought336 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought336 instance = new Thought336 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought336 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought336 instance = new Thought336 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought336 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought336 instance = new Thought336 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought336 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought336 instance = new Thought336 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought336 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought336 instance = new Thought336 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    double ld0 = 258.30404759073565;
    fd0 = fd1 - ld0;
    fd0 *= -1;
    double ld1 = 785.8547643739586;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, fd0, fd1);
}
    ld0 *= -1;
    Thought lo2 = Thought60.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);

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
    Thought lo0 = Thought107.getInstance();
    Output.points[3][6] += fd1;
    boolean lb1 = true;
    Output.points[3][7] -= fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    ab1 = fd1 < fd0;
    ab2 = fd1 < fd0;
    ab3 = fd1 < fd0;
    Thought lo2 = Thought91.getInstance(ab4, fb0, fb1, lb1);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 887.9840328321925;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    fd0 = fd1 - ld0;
    Output.points[3][8] += ad1;
    lb1 = fb0 && fb1;
    lb1 = !fb0;
    fb1 = lb1 || fb0;
    boolean lb2 = true;
    fb0 = fb1 && lb1;
    lb2 = ad2 > ad3;
    boolean lb3 = false;
    lb3 = ad4 < fd0;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(ld0, ad1, ad2, ad3, lb1, lb2, lb3, fb0);
}
    if (fb1) {
        for(int i0=0; i0<10; i0++){
            Output.points[4][0] += ad4;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, lb3, fb0);
}
            fd0 = fd1 + ld0;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 314.8109878946031;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought112.getInstance();
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = !fb0;
    if (fb1) {
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
}
        Output.points[4][1] += ad3;
        fb0 = fb1 && ab1;
        boolean lb2 = true;
        double ld3 = 986.1275019943653;
if(fo1 != null){
          ab1 = fo1.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Thought lo4 = Thought185.getInstance(fo0, fo1, fo0, fo1, fb1, lb2, ab1, ab2);
        } else if (ab4) {
        fb0 = !fb1;
        Output.points[4][2] -= ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
        Thought lo5 = Thought79.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
        boolean lb6 = true;
        lb6 = !ab1;
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
    Output.points[4][3] += fd1;
    double ld0 = 122.23193384201285;
    Output.points[4][4] += ld0;
if(ao2 != null){
      ao2.m2();
}
    fd0 *= -1;
    Thought lo1 = Thought116.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd1 > ld0;
    Thought lo2 = Thought126.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ld0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
}
    boolean lb3 = true;
if(fo0 != null){
      fo0.m3();
}
    double ld4 = 154.11179582945613;
if(fo1 != null){
      ld0 = fo1.m3(fb0, fb1, lb3, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ld4, fd0, fd1, ld0, lb3, fb0, fb1, lb3);
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
    fb1 = fb0 || fb1;
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        ad3 *= -1;
        ad4 = fd0 + fd1;
        Thought lo0 = Thought10.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
        fb0 = fd0 > fd1;
        double ld1 = 687.0584548217668;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ld1 = ao2.m3(ad1, ad2, ad3, ad4);
}
        fb1 = fd0 > fd1;
        for(int i1=0; i1<10; i1++){
            fb0 = ld1 > ad1;
            fb1 = fb0 && fb1;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
            fb0 = fb1 || fb0;
            boolean lb2 = false;
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
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab2 = ab3 || ab4;
    Thought lo0 = Thought390.getInstance(fb0, fb1, ab1, ab2);
    Thought lo1 = Thought333.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
    boolean lb2 = false;
    ab3 = fd1 > fd0;
    ab4 = fb0 && fb1;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb2, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
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
    ad1 = ad2 - ad3;
    double ld0 = 320.10003425392995;
    ab2 = ad3 > ad4;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ad1, ad2, fb1, lb1, ab1, ab2);
}
    ab3 = ad3 > ad4;
    ab4 = fb0 || fb1;
    lb1 = !ab1;
    ab2 = ab3 && ab4;
    fd0 = fd1 + ld0;

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
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        double ld0 = 694.7522648432625;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
        if (fb1) {
if(fo1 != null){
              fo1.m1();
}
            fb0 = !fb1;
            ld0 = fd0 + fd1;
            fb0 = ld0 < fd0;
            fb1 = fb0 || fb1;
            fb0 = fd1 < ld0;
if(fo0 != null){
              fo0.m1(fb1, fb0, fb1, fb0);
}
            fd0 = fd1 + ld0;
            } else if (fb1) {
            fd0 = fd1 + ld0;
            Thought lo1 = Thought258.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
            fb0 = fd1 < ld0;
            Output.points[4][5] -= fd0;
if(fo1 != null){
              fo1.m3(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
            if (fb1) {
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld0 = 281.63628580129716;
    ld0 = fd0 - fd1;
    fb1 = ld0 < fd0;
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ab4 = fo0.m2(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb2 = false;
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
    ad2 = ad3 - ad4;
    boolean lb0 = true;
        boolean lb1 = true;
    fd0 *= -1;
    lb1 = fd1 > ad1;
    double ld2 = 175.18087702652608;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;
    ad1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = fd1 < ld2;
    fb0 = fb1 || lb0;
    lb1 = fb0 || fb1;
    lb0 = !lb1;
    Thought lo3 = Thought196.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
    boolean lb4 = false;
    boolean lb5 = false;

Thought.STACK_COUNTER++;
return lb4;
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
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    Thought lo0 = Thought365.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    boolean lb1 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb1 = ad4 < fd0;
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought375.getInstance(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fd0 *= -1;
        fd1 = ad1 + ad2;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought77.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    lb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    if (fb0) {
if(fo0 != null){
          ao4 = fo0.m4(fb1, lb1, fb0, fb1);
}
        Thought lo2 = Thought255.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
        fd0 = fd1 + fd0;
        if (fb0) {
            fb1 = lb1 || fb0;
            Output.points[4][6] += fd1;
if(ao4 != null){
              ao4.m1(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
              fo0.m1(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb1);
}
}}
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
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
        Thought lo0 = Thought313.getInstance(ao2, ao3, ao4, fo0);
        boolean lb1 = false;
if(ao1 != null){
          fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
        if (lb1) {
            fb0 = ad3 > ad4;
            boolean lb2 = true;
            Thought lo3 = Thought116.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
            ad3 *= -1;
            fb0 = fb1 || lb2;
            lb1 = fb0 || fb1;
            lb2 = ad4 < fd0;
            fd1 *= -1;
if(fo1 != null){
              fo1.m2();
}
if(ao1 != null){
              ad1 = ao1.m3(lb1, fb0, fb1, lb2);
}
            Thought lo4 = Thought366.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb2);
            lb1 = fd1 < ad1;
}}
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
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fb1 = ab1 || ab2;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    double ld0 = 571.1287439682704;
    fd0 = fd1 - ld0;
    Output.points[4][7] -= fd0;
    Thought lo1 = Thought278.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad1 = ad2 + ad3;
    double ld1 = 291.7058730318859;
if(ao4 != null){
      ao3 = ao4.m4(lb0, ab1, ab2, ab3);
}
    Thought lo2 = Thought66.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
    ab1 = ld1 < ad1;
if(ao3 != null){
      ao3.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, ab1, ab2);
}
    fd1 = ld1 - ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 + ld1;
    ad1 *= -1;
    ab3 = !ab4;
    ad2 *= -1;
if(ao4 != null){
      fb0 = ao4.m2(ad3, ad4, fd0, fd1);
}
    fb1 = lb0 && ab1;
    double ld3 = 803.079325888346;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ld3, ad1, ad2);
}
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb5 = true;
if(ao1 != null){
      lb5 = ao1.m2(ab1, ab2, ab3, ab4);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 463.52259357560433;
    fb0 = fb1 && fb0;
    Output.points[4][8] -= ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld1 = 871.8622242028423;
    boolean lb2 = false;
    if (fb0) {
        double ld3 = 712.6945900574505;
        fb1 = lb2 || fb0;
        fb1 = ld0 < ld1;
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
    boolean lb0 = false;
    if (lb0) {
        double ld1 = 979.0095912434258;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Thought lo2 = Thought255.getInstance(ld1, fd0, fd1, ld1);
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
        fd1 = ld1 - fd0;
        ab2 = fd1 < ld1;
if(fo0 != null){
          fo0.m3();
}
        double ld3 = 486.7140304548193;
        double ld4 = 261.06837960057834;
        ab3 = ab4 || fb0;
        ld3 = ld4 - fd0;
        fb1 = !lb0;
        Thought lo5 = Thought86.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, ld3, ld4, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
          ab2 = fo0.m2(fd0, fd1, ld1, ld3, ab3, ab4, fb0, fb1);
}
        Thought lo6 = Thought121.getInstance(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
        boolean lb7 = true;
        if (ab3) {
            Output.points[5][0] += ld4;
            boolean lb8 = true;
            Output.points[5][1] += fd0;
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1);
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        Output.points[5][2] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 490.11278755068435;
    ld0 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[5][3] += ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 > ld0;
    Thought lo1 = Thought85.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought94.getInstance();
    ad2 *= -1;
    ad3 *= -1;
    Output.points[5][4] -= ad4;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ad2 < ad3;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad4, fd0, fd1, ad1);
}
    boolean lb1 = true;
    boolean lb2 = false;
    lb1 = ad2 > ad3;
    boolean lb3 = false;
    ad4 *= -1;
    fd0 *= -1;
    lb2 = !lb3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ab1 = ad4 < fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 538.9017547745418;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo1 = Thought313.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
        double ld2 = 449.21363102161934;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 = ld2 - fd0;
    Thought lo3 = Thought223.getInstance(fd1, ld0, ld2, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fb1 = ld0 > ld2;
    Thought lo4 = Thought343.getInstance(fd0, fd1, ld0, ld2);
    fd0 = fd1 - ld0;
    ld2 = fd0 + fd1;
    ld0 = ld2 + fd0;
    fb0 = fd1 < ld0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    Thought lo1 = Thought328.getInstance();
    boolean lb2 = false;
    lb2 = fb0 && fb1;
if(ao2 != null){
      ad3 = ao2.m3(lb0, lb2, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, lb0, lb2, fb0, fb1);
}
    boolean lb3 = true;
    lb0 = lb2 && lb3;
    ad2 *= -1;
    double ld4 = 304.9988065881466;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    Output.points[5][5] += fd1;
    ab2 = ab3 || ab4;
    Thought lo0 = Thought167.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
        Output.points[5][6] += fd0;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 || ab4;
        boolean lb2 = false;
        Thought lo3 = Thought200.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
if(fo0 != null){
          fo0.m3();
}
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo1.m1(ab4, fb0, fb1, lb2);
}
        boolean lb4 = true;
        double ld5 = 413.17204754505156;
        lb4 = ld5 < fd0;
        lb1 = !ab1;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, fd1, ld5, fd0, fd1, ab2, ab3, ab4, fb0);
}
        double ld6 = 877.9012794194442;
        fb1 = ld5 < ld6;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld5, ld6, fd0, lb2, lb4, lb1, ab1);
}
if(ao1 != null){
          ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ab1 = ab2 || ab3;
        Thought lo0 = Thought284.getInstance(ao2, ao3, ao4, fo0);
    Output.points[5][7] += ad4;
    Output.points[5][8] += fd0;
    ab4 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    ab1 = fd0 < fd1;
    ad1 = ad2 - ad3;
    ab2 = ad4 > fd0;
    ab3 = fd1 < ad1;
    ab4 = ad2 < ad3;
if(ao2 != null){
      fb0 = ao2.m2();
}
    fb1 = ad4 < fd0;
    boolean lb1 = true;
if(ao3 != null){
          ao3.m1(lb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = !lb1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 + fd1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    double ld2 = 751.9317183629962;
    Thought lo3 = Thought60.getInstance(ld2, fd0, fd1, ld2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
    lb0 = fd1 < ld2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = fb0 && fb1;
    fd0 *= -1;
    lb0 = lb1 || fb0;
    fb1 = lb0 && lb1;

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
    Thought lo0 = Thought164.getInstance(ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    Thought lo1 = Thought118.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    Thought lo2 = Thought68.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought133.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
        ab1 = ab2 || ab3;
        double ld4 = 217.1598772654989;
if(fo0 != null){
          ab4 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld4, ab3, ab4, fb0, fb1);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ad1 > ad2;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
        ad3 = ad4 + fd0;
        fd1 = ad1 - ad2;
        boolean lb1 = true;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
        Thought lo2 = Thought357.getInstance(ad4, fd0, fd1, ad1);
        ad2 = ad3 - ad4;
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
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab2 = fd1 > ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    ab3 = fd1 > ad1;
    ab4 = fb0 || fb1;
    boolean lb0 = true;
    lb0 = ad2 < ad3;
    ab1 = !ab2;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ad4 = fd0 + fd1;
    Thought lo1 = Thought22.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld2 = 96.83133728546689;

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
    boolean lb0 = false;
    Thought lo1 = Thought55.getInstance(ao2, ao3, ao4, fo0);
    for(int i0=0; i0<10; i0++){
        lb0 = !fb0;
        fb1 = lb0 || fb0;
        fd0 = fd1 + fd0;
        Thought lo2 = Thought39.getInstance(fd1, fd0, fd1, fd0);
        double ld3 = 99.59714761553221;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld3, fd0);
}
        fd1 = ld3 - fd0;
if(ao1 != null){
          fo1 = ao1.m4();
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought367.getInstance(fb0, fb1, fb0, fb1);
    Thought lo1 = Thought351.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    double ld2 = 12.558003752859891;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Thought lo3 = Thought379.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld2, ad1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb4 = true;
    boolean lb5 = false;
    lb4 = lb5 || fb0;
    double ld6 = 992.0192802690747;

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
if(ao2 != null){
      fd0 = ao2.m3(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought303.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
    Output.points[6][0] -= fd1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        ab3 = fd0 < fd1;
        ab4 = !fb0;
        boolean lb1 = false;
        fd0 *= -1;
        double ld2 = 304.3431819522009;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
        Thought lo3 = Thought311.getInstance(fb1, lb1, ab1, ab2);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
        }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo4 = Thought347.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
    Output.points[6][1] += fd1;
    ab3 = ab4 || fb0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = ab1 || ab2;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought187.getInstance(ad1, ad2, ad3, ad4);
    ab1 = ab2 || ab3;
    fd0 = fd1 + ad1;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab3 = !ab4;
if(ao1 != null){
      ao1.m3();
}
    double ld2 = 145.23795438593777;
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 || ab2;
    ad4 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4(ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought289.getInstance(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
    Output.points[6][2] -= ad4;
    fd0 = fd1 + ld2;
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    ab4 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld2, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(lb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
}
    ld2 = ad1 + ad2;

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
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    double ld0 = 240.7030489061149;
    fd0 *= -1;
    fb0 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 = fd1 + ld0;
    fd0 *= -1;
    fb1 = fd1 > ld0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
        fb1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    double ld1 = 671.9269180223991;

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
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m1();
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
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
}